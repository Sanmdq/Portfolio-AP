export class persona {
    id_persona?: number;
    nombre: string;
    apellido: string;
    imagen: string;

    constructor(nombre: string, apellido: string, imagen: string){
        this.nombre = nombre;
        this.apellido = apellido;
        this.imagen = imagen;
    }
}