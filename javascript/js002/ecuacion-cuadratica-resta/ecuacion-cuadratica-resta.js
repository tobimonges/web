document.getElementById("calcular").addEventListener("click", function() {
    let a = parseFloat(document.getElementById("valorA").value);
    let b = parseFloat(document.getElementById("valorB").value);
    let c = parseFloat(document.getElementById("valorC").value);

    if (isNaN(a) || isNaN(b) || isNaN(c)) {
        alert("Por favor, completa todos los campos");
        return;
    }

    let raiz = b * b - 4 * a * c;
    
    if (raiz > 0) {
        let resultado = (-b - Math.sqrt(raiz)) / (2 * a);
        document.getElementById("resultado"). value = resultado
    } else if (raiz === 0) {
        let resultado = -b / (2 * a);
        document.getElementById("resultado"). value = resultado
    } else {
        document.getElementById("resultado").value = "Syntax Error";
    }
})