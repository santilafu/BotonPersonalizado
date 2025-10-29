# Guía técnica: creación de un botón personalizado en Java Swing

## Introducción

Este documento forma parte del trabajo realizado durante las prácticas en una empresa de desarrollo de soluciones empresariales en Java.  
El objetivo es describir el proceso para construir un **botón personalizado** reutilizable, con un color base corporativo y un comportamiento dinámico que cambie su aspecto cuando el usuario pasa el cursor por encima.

El trabajo se ha desarrollado en **IntelliJ IDEA** utilizando **Java y Swing**, sin editores visuales, con el fin de entender a fondo la estructura del componente y su comportamiento interno.

---

## Objetivo del componente

El botón debía cumplir las siguientes condiciones:

- Tener un color base corporativo definido.
- Cambiar de color al pasar el cursor por encima (efecto hover).
- Aplicar un estilo más moderno que el diseño tradicional de Swing.
- Poder reutilizarse en cualquier ventana o proyecto Java.

El resultado final es un componente propio que puede añadirse a cualquier interfaz gráfica de Swing sin modificaciones.

---

## Proceso de creación

1. **Diseño de la clase del componente**  
   Se creó una clase que hereda de `JButton`. Esto permite mantener las funciones básicas del botón, pero con libertad total para personalizar su apariencia.

2. **Definición de los colores**  
   Se establecieron tres colores principales:
    - **Color base** para el estado normal.
    - **Color hover** para cuando el ratón entra en el área del botón.
    - **Color presionado** para el momento del clic.  
      Estos colores se definieron mediante objetos `Color` en formato RGB.

3. **Configuración visual**  
   Se modificaron propiedades del botón para mejorar su aspecto:
    - `setFont()` para establecer una tipografía moderna.
    - `setForeground()` y `setBackground()` para los colores.
    - `setOpaque(true)` para que se muestre el color de fondo.
    - `setBorderPainted(false)` y `setFocusPainted(false)` para eliminar los bordes clásicos de Swing.
    - `setCursor(new Cursor(Cursor.HAND_CURSOR))` para cambiar el cursor al de mano al pasar por encima.

4. **Gestión de eventos de interacción**  
   Se añadió un `MouseListener` a través de la clase `MouseAdapter`.  
   Con esto se controlan los eventos:
    - `mouseEntered`: cambia el color al pasar el cursor.
    - `mouseExited`: vuelve al color base al salir.
    - `mousePressed` y `mouseReleased`: permiten dar sensación de clic.

   Esta gestión de eventos es la que da al botón un comportamiento dinámico y moderno.

5. **Integración en una ventana**  
   Se creó una clase `Main` con una ventana simple (`JFrame`) donde se añadió el nuevo botón.  
   Esto permitió probar la interacción y ajustar los márgenes, colores y tamaño.

6. **Reutilización y mantenimiento**  
   El componente se diseñó como una clase independiente, por lo que puede añadirse fácilmente a otros proyectos importando su paquete.  
   El código está documentado con comentarios claros para que cualquier desarrollador pueda modificar los colores, fuente o comportamiento según las necesidades de la empresa.

---

## Técnicas aplicadas

- **Herencia de clases**: uso de `extends JButton` para ampliar la funcionalidad del componente base.
- **Eventos del ratón**: empleo de `MouseAdapter` para capturar acciones del usuario.
- **Renderizado visual**: control manual de los colores, fuentes y bordes del componente.
- **Diseño reutilizable**: creación de una clase independiente y flexible para su uso en distintos entornos.

---

