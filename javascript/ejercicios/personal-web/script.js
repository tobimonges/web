document.addEventListener("DOMContentLoaded", function () {
    const textElement = document.getElementById("typing-effect");
    const text = "{Backend Developer}";
    let index = 0;

    function typeWriter() {
        if (index < text.length) {
            textElement.textContent += text.charAt(index);
            index++;
            setTimeout(typeWriter, 150); // Ajusta el tiempo entre letras (en milisegundos)
        } else {
            setTimeout (() => {
                deleteText();
            }, 150)
        }
    }
    function deleteText() {
        if (index > 0) {
            textElement.textContent = text.substring(0, index - 1);
            index--;
            setTimeout(deleteText, 100);
        } else {
            setTimeout(typeWriter, 100)
        }
    }

    typeWriter();
});

document.getElementById('boton-portafolio').addEventListener('click', function() {
    document.querySelector('.container').classList.add('fade-out');
    setTimeout(() => {
        window.location.href = 'portfolio.html'
    })
})