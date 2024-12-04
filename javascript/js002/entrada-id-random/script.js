function modificar() {
    let valorId = document.getElementById("id").value;
    let elemento = document.getElementById(valorId);
    if (elemento) {
        elemento.innerHTML = random(1,100);
    } else {
        alert ("No se encontro el ID ingresado!")
    }

}

function random(min,max) {
    return (Math.floor(Math.random() * max) + min)
}