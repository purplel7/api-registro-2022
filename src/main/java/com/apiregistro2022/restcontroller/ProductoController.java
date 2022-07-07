package com.apiregistro2022.restcontroller;



import com.apiregistro2022.entity.Categoria;
import com.apiregistro2022.entity.Producto;
import com.apiregistro2022.service.CategoriaService;
import com.apiregistro2022.service.ProductoService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Agregamos la anotacion para que sea un controlar
@RestController

//Argegamos el nombre con el cual se va a buscar el controlador rest
@RequestMapping("/producto")
public class ProductoController {
    
    @Autowired
    private ProductoService productService;
    
    //Para poder obtener valores utilizamos la anotacion GetMapping
    @GetMapping
    public List<Producto> finAll(){
        return productService.findAll();
    }
    
    @GetMapping("/custom")//trae los de estado true
    public List<Producto> findAllCustom(){
        return productService.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<Producto> findById(@PathVariable long id){
        return productService.findById(id);
    }
    
    //Emviar valores
    @PostMapping
    public Producto add(@RequestBody Producto p){
        return productService.add(p);
    }
    
    //Actualizar valores
    @PutMapping("/{id}")
    public  Producto update (@PathVariable Long id, @RequestBody Producto p){
        p.setCodigo(id);
        return productService.update(p);
    }
    
    //eliminar Valores
    @DeleteMapping("/{id}")
    public  Producto delete (@PathVariable Long id){
        Producto objProducto = new Producto();
        objProducto.setCodigo(id);
        return productService.delete(objProducto);
    }
    
   
}
