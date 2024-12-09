
/*
const btn = document.getElementById('btnFetchCharacters');

const div = document.getElementById('characters');

btn.addEventListener('click', () => {
    console.log('Fetch API');
    fetch('https://rickandmortyapi.com/api/character')
        .then((response) => response.json())
        .then((data) => renderCharacters(data.results));
});
function renderCharacters(characters) {
    characters.forEach(ch => {
        div.innerHTML += `<img src="${ch.image}"> `;
    });
}
*/
/*
const resourceUrl = 'https://rickandmortyapi.com/api/character/';

$(document).ready(function() {
    $("button").click(function() {
        $(".character-list").toggleClass("show");
    });
});
$.ajax({
    url: resourceUrl,
    method: 'GET',
    success: function(response) {
      const html = response.results.map(item =>
        `<li>
          <img src="${item.image}" alt="" />
          ${item.name}
        </li>`
      );
      
      $('.character-list').html(html.join(''));
    },
    error: function(err) {
      console.log(err);
    }
  });

  */

const btn = document.getElementById('boton');
const div = document.getElementById('personajes')

btn.addEventListener('click', () => {
  console.log('AJAX Request');
  
  const xhr = new XMLHttpRequest();
  
  xhr.open('GET', 'https://rickandmortyapi.com/api/character', true);

  xhr.onload = function () {
    if (xhr.status === 200) {
      const data = JSON.parse(xhr.responseText);
      renderCharacters(data.results);
    } else {
      console.error(`Error: ${xhr.status} - ${xhr.statusText}`);
    }
  };
  xhr.onerror = function () {
    console.error('Error en la solicitud AJAX.');
  };
  xhr.send();
});

function renderCharacters(characters) {
  characters.forEach(element => {
    div.innerHTML += `<img src="${element.image}" alt="${element.name}">`;
  });
}