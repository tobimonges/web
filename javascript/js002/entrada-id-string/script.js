function modificar() {


    let valorId = document.getElementById("id").value;
    let valorString = document.getElementById("string").value;
    
    let elemento = document.getElementById(valorId)
    
    if (elemento) {
        elemento.innerHTML = valorString;
    } else {
        alert ("No se encontro el ID ingresado!")
    
    }
}
