$(document).ready(function () {
    //codigo

    $('a').mouseover(function (evento) {
        $('#capa').addClass("clasecss");
    });

    $('a').mouseout(function (evento) {
        $('#capa').removeClass('clasecss');
    });
});






/*
$("#capa").mouseenter(function (evento) {
    $("#mensaje").css("display", "block");
});
$("#capa").mouseleave(function (evento) {
    $("#mensaje").css("display", "none");
    $("#mensaje").css("background-color","#000", "color", "#fff")
    $("#mensaje").css("color", "#fff")
});

 */

/*


$('#rojo').on('click', () => {
    $('p').addClass('rojo');
    $('p').removeClass('azul');
})

$('#azul').on('click', function() {
    $('p').addClass('azul');
    $('p').removeClass('rojo');
})



// No funciona en IE 11
fetch('https://jsonplaceholder.typicode.com/todos/1')
    .then(response => response.json())
    .then(json => console.log(json))

$.getJSON('https://jsonplaceholder.typicode.com/todos/1', function (data) {
    console.log(data);
});


function ready(fn) {
    if (document.readyState !== 'loading') {
        fn();
    } else {
        document.addEventListener('DOMContentLoaded', fn);
    }
}

ready(function() {
    document.getElementById('load').addEventListener('click', function() {
        fetch('https://jsonplaceholder.typicode.com/todos')
            .then(response => response.json())
            .then(data => showElements(data))
    });
});

function generateElements(html) {
    const template = document.createElement('template');
    template.innerHTML = html.trim();
    return template.content.children;
}

function showElements(data) {
    data.forEach(element => {
        console.log(element);
        let html = generateElements(`<section><h1>${element.title}</h1><p>Usuario: ${element.userId}</p></section>`);
        console.log(html);
        Array.from(html).forEach(element => {
            document.body.appendChild(element);
        });
    });
}




$(document).ready(() => {
    $('#load').on('click', () => {
        $.getJSON('https://jsonplaceholder.typicode.com/todos/', showAll)
    })
});

function showAll (data) {
    data.forEach(element => {
        let html = $(`<section><h1>${element.title}</h1><p>Usuario: ${element.userId}</p>`);
        $(document.body).append(html);
    })
}
*/
