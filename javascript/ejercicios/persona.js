class Persona {
    static contadorPersonas = 0;
    constructor (nombre, apellido, edad) {
        this._idPersona = ++Persona.contadorPersonas;
        this._nombre = nombre;
        this._apellido = apellido;
        this._edad = edad
    }
    get idPersona() {
        return this._idPersona;
    }
    get nombre() {
        return this._nombre;
    }
    get apellido () {
        return this._apellido;
    }
    get edad () {
        return this._edad;
    }

    set nombre(nombre) {
        this._nombre = nombre;
    }
    set apellido(apellido) {
        this._apellido;
    }
    set edad(edad) {
        this._edad;
    }
    toString () {
        return `${this.idPersona} ${this.nombre} ${this.apellido} ${this.edad}`
    }
}


class Empleado extends Persona{
    static contadorEmpleados = 0;
    constructor (nombre, apellido, edad, sueldo) {
        super(nombre, apellido, edad)
        this._idEmpleado = ++Empleado.contadorEmpleados;
        this._sueldo = sueldo;
    }
    get idEmpleado() {
        return this._idEmpleado;
    }
    get sueldo () {
        return this._sueldo;
    }
    set sueldo (sueldo) {
        this._sueldo = sueldo;
    }

    toString () {
        return `${super.toString()} - ${this._idEmpleado} ${this.sueldo}`
    }
}

class Cliente extends Persona{
    static contadorClientes = 0;
    constructor(nombre, apellido, edad, fechaRegistro) {
        super(nombre, apellido, edad);
        this._idCliente = ++Cliente.contadorClientes;
        this._fechaRegistro = fechaRegistro;
    }
    get idCliente() {
        return this._idCliente;
    }
    get fechaRegistro() {
        return this._fechaRegistro;
    }
    set fechaRegistro(fechaRegistro) {
        this._fechaRegistro = fechaRegistro;
    }
    toString () {
        return `${super.toString()} -  ${this.idCliente} ${this.fechaRegistro}`
    }
}

let cliente1 = new Cliente("tobi","monges","24", new Date());
let cliente2 = new Cliente("tobi","monges","24",new Date());
let empleado1 = new Empleado("tobi","monges","24", 10000);
let empleado2 = new Empleado("tobi","monges","24", 10000);
console.log(cliente1)
console.log(cliente2)
console.log(empleado1)
console.log(empleado2)

