var tablero = new Array(9);
var turno = 1;
var jugando = true;
let jugador1 = {
    nombre: '',
    figura: '',
    posicion: 1
}
let jugador2 = {
    nombre: '',
    figura: '',
    posicion: 2
}

function iniciarJuego() {
    limpiarTablero();
    cargarDatos();
    inicializarTablero();

}
function limpiarTablero() {
    for (let i = 1; i < 10; i++) {
        let id = i.toString()
        document.getElementById(id).value = " ";
    }
}
function cargarDatos() {
    jugador1.nombre = prompt("Ingrese su nombre jugador 1")
    jugador1.nombre = jugador1.nombre.toUpperCase();
    do {
        jugador1.figura = prompt(`${jugador1.nombre}, elije tu figura -> ( X | O )`)
        jugador1.figura =jugador1.figura.toUpperCase();
    } while (jugador1.figura != "X" && jugador1.figura != "O");

    jugador2.nombre = prompt("Nombre jugador 2:");
    jugador2.nombre = jugador2.nombre.toUpperCase();
    if (jugador1.figura == "X") {
        jugador2.figura = "O"
        alert(`${jugador2.nombre}, te toca la figura --> "O"`)

    } else {
        alert(`${jugador2.nombre}, te toca la figura --> "X"`)
        jugador2.figura = "X"
    }

    
}

function inicializarTablero() {
    for (let i = 0; i < 9; i++) {
        tablero[i] = -1;
    }
}


function marcar(p) {
    let posicion = (p-1);
    let id = p.toString();
    //let elemento = document.getElementById(id)
    let jugador = turno == 1 ? jugador1 : jugador2
    if(!jugando) {
        alert("Fin del juego.");
        return;
    }
    if (tablero[posicion] == -1) {
        tablero[posicion] = jugador.posicion;
        document.getElementById(id).value = jugador.figura;

        if (verificarGanador()) {
            jugando = false;
            alert("Ha ganado el jugador " + jugador.nombre);
        } else if (verificarTablero()) {
            jugando = false;
            alert("Han empatado.")
        }
    } else {
        alert("Casilla ocupada.")
    }
    turno = turno == 1 ? 2 : 1;
}

function verificarGanador() {
    // Filas
    if (tablero[0] != -1 && tablero[0] == tablero[1] && tablero[1] == tablero[2]) {
        pintarTablero("1","2","3");
        return true;
    }
    if (tablero[3] != -1 && tablero[3] == tablero[4] && tablero[4] == tablero[5]) {
        pintarTablero("4","5","6")
        return true;
    }
    if (tablero[6] != -1 && tablero[6] == tablero[7] && tablero[7] == tablero[8]) {
        pintarTablero("7","8","9")
        return true;
    }

    // Columnas
    if (tablero[0] != -1 && tablero[0] == tablero[3] && tablero[3] == tablero[6]) {
        pintarTablero("1","4","7")
        return true;
    }
    if (tablero[1] != -1 && tablero[1] == tablero[4] && tablero[4] == tablero[7]) {
        pintarTablero("2","5","8")
        return true;
    }
    if (tablero[2] != -1 && tablero[2] == tablero[5] && tablero[5] == tablero[8]) {
        pintarTablero("3","6","9")
        return true;
    }

    // Diagonales
    if (tablero[0] != -1 && tablero[0] == tablero[4] && tablero[4] == tablero[8]) {
        pintarTablero("1","5","9")
        return true
    }
    if (tablero[2] != -1 && tablero[2] == tablero[4] && tablero[4] == tablero[6]) {
        pintarTablero("3","5","7")
        return true;
    }
    return false;
}


function verificarTablero() {
    for (let i = 0; i < 9; i++) {
        if (tablero[i] == -1) {
            return false;
        }
    }
    return true;
}

function pintarTablero(i1,i2,i3) {
    document.getElementById(i1).style.backgroundColor = "#d2ffeb"
    document.getElementById(i2).style.backgroundColor = "#d2ffeb"
    document.getElementById(i3).style.backgroundColor = "#d2ffeb"
    for (let i = 1; i < 10; i++) {
        if (i == i1 || i == i2 || i == i3) {
            continue;
        }
        let j = i.toString();
        document.getElementById(j).style.backgroundColor = "#ffdede"
    }
}