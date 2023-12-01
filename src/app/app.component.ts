import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { FormGroup } from '@angular/forms';
import { Validators } from '@angular/forms';
import { PaisesService } from './services/paises/paises.service';
import { CiudadesService } from './services/ciudades/ciudades.service';
import { CotizacionService } from './services/cotizacion/cotizacion.service';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  paises: any;
  ciudades: any;



  constructor(private fb: FormBuilder,
    public paisesService: PaisesService,
    public ciudadesService: CiudadesService,
    public cotizacionService: CotizacionService,
    public cotizacionForm: FormGroup
    ) {
  }

  ngOnInit(): void {

    this.cotizacionForm = this.fb.group({
    numero_cotizacion :['', Validators.required],
    estado :['', Validators.required],
    fecha_creacion:['', Validators.required],
    vigencia_cotizacion:['', Validators.required],  	 
    moneda:['', Validators.required],
    fecha_modificacion:['', Validators.required],  
    naviera:['', Validators.required], 
    mercancia:['', Validators.required],	
     valor_mercancia:['', Validators.required],
     id_ciudad_origen:['', Validators.required],
     id_ciudad_destino:['', Validators.required],
     fecha_cierre:['', Validators.required]


    });;

    this.paisesService.getAllPaises().subscribe(resp =>{

      this.paises = resp;
      console.log("llego respuesta",resp);
      
      },
      
       error=> {console.error(error) }
      
    )

      
  }

  guardar(): void{
  }

  cargarCiudadesPorPais(idPais: number){
    this.ciudadesService.getAllCiudadesByPais(idPais).subscribe(resp =>{

      this.paises = resp;
      console.log("llego respuesta",resp);
  },
  error=> {console.error(error) }
      
    )
  }
  

}
