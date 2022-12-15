import React from "react";
//nos permiten hacer la navegación de nuestra web
import { BrowserRouter, Routes, Route } from "react-router-dom";
import { HomePage } from "./pages";

// el App es nuestro Main. El enfoque es que tendrá todas las urls
const App = () => {
    return(
        //desde el navegador
        <BrowserRouter>
            {/* vamos a tener distitnas rutas */}
            <Routes>
                {/* especificamos cada ruta */}
                <Route path="/" element = { <HomePage/>}/>
            </Routes>
        </BrowserRouter>
    )
}

export default App;






//Arrow function
/*const App = ()=> { // buena práctica que contenga el nombre de la carpeta
    return ( //retornamos una vista
    <table class="table">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">First</th>
      <th scope="col">Last</th>
      <th scope="col">Handle</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>Mark</td>
      <td>Otto</td>
      <td>@mdo</td>
    </tr>
    <tr>
      <th scope="row">2</th>
      <td>Jacob</td>
      <td>Thornton</td>
      <td>@fat</td>
    </tr>
    <tr>
      <th scope="row">3</th>
      <td colspan="2">Larry the Bird</td>
      <td>@twitter</td>
    </tr>
  </tbody>
</table>
    )

} */ //lo mandamos a componente tables

/*const App2 = ()=> {
    return (
     <div>
     <h1>Hola Mundo templado :D</h1>
     <p>Esto es un párrafo</p>
     <div> 
         <h2>Esto es otro div</h2>
     </div>
     <div>
         <h3> Y esto es otro más</h3>
     </div>
 </div>
    )
 }

export {App2}; //Si voy a importar mas de un componente tengo que quitar el default y poner los componentes en {} */
