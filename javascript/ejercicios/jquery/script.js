
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
  
  // Crear una instancia de XMLHttpRequest
  const xhr = new XMLHttpRequest();

  // Configurar la solicitud (metodo GET y URL)
  xhr.open('GET', 'https://rickandmortyapi.com/api/character', true);

  // Registrar el evento para manejar la respuesta
  xhr.onload = function () {

    // Convertir la respuesta JSON a un objeto
    const data = JSON.parse(xhr.responseText);

    // Pasar los resultados a la funcion
    renderCharacters(data.results);
  };

  // Enviar la solicitud
  xhr.send();

});

function renderCharacters(characters) {
  characters.forEach(element => {
    
    // Insertar las imagenes en el div
    div.innerHTML += `<img src="${element.image}" alt="${element.name}">`;
  });
}