# 🔐 Simulación de Sistema de Autenticación Multicanal (Patrón Strategy e Interfaces en Java)

Este proyecto es una aplicación en Java que modela un servicio flexible de autenticación de usuarios utilizando diferentes estrategias de verificación de credenciales (Contraseña Tradicional, Autenticación Biométrica y Token OAuth). Pone en práctica el uso de **interfaces**, **polimorfismo** y el **Patrón Strategy** para intercambiar comportamientos de validación de manera dinámica en memoria.

---

## 🧩 Clases y Estructura del Sistema

El diseño del software se organiza mediante un contrato contractual por interfaz y múltiples implementaciones concretas:

*   **`MetodoAutenticacion` (Interfaz)**: Define el contrato genérico que toda estrategia de autenticación debe cumplir mediante el método `autenticar(String credencialPrincipal, String credencialSecundaria)`.
*   **`AuthPassword`**: Modela la validación basada en usuario/contraseña (ej. `"admin"` y `"1234"`).
*   **`AuthBiometrica`**: Modela la verificación mediante factores biométricos o huellas digitales.
*   **`AuthTokenOAuth`**: Modela la autenticación mediante tokens de seguridad o autorización externa.
*   **`ServicioLogin`**: Actúa como el contexto o invocador principal que procesa la solicitud de acceso.
    *   **Métodos principales:** `iniciarSesion(MetodoAutenticacion metodo, String credencialPrincipal, String credencialSecundaria)`, recibe por parámetro la estrategia de autenticación y evalúa el resultado booleano para autorizar o denegar el acceso.
*   **`Main`**: Punto de entrada del programa. Instancia el servicio de login y las distintas estrategias de autenticación, simulando casos de éxito y de fallo para cada mecanismo.

---

## ⚙️ Conceptos Clave de POO y Patrones Aplicados

1. **Patrón de Diseño Strategy:** Permite definir una familia de algoritmos de autenticación, encapsular cada uno en una clase independiente y hacerlos intercambiables en tiempo de ejecución sin modificar el código del `ServicioLogin`.
2. **Polimorfismo por Interfaces:** El servicio de login opera de forma genérica a través de la interfaz `MetodoAutenticacion`, desconociendo si está validando una contraseña, una huella o un token.
3. **Inyección de Dependencias por Parámetro:** La estrategia de autenticación se inyecta directamente en el método `iniciarSesion()`, otorgando máxima flexibilidad operativa.
4. **Validación de Credenciales Encapsulada:** Cada clase concreta es responsable única de definir sus reglas de validación lógica (`return true` o `false`).

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera el siguiente resultado:

```text
--- Login con password ---
Se ha autorizado correctamente
Error de autenticacion

--- Login biometrico ---
Se ha autorizado correctamente
Error de autenticacion

--- Login con token OAuth ---
Error de autenticacion
Error de autenticacion
