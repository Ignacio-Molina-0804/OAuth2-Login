# 🚀 Social Login OAuth2 Example

Autenticación moderna y sencilla con **Spring Boot** y **OAuth2**.  
Este proyecto te permite integrar inicio de sesión social con **GitHub** y **Google** en cuestión de minutos.

---

## 🧩 ¿Qué incluye?

- ✅ Spring Boot **3.5.4**
- 🔐 Seguridad con **Spring Security**
- 🔑 Autenticación **OAuth2** lista para usar
- 🌐 Endpoints públicos y protegidos
- ⚙️ Soporte para múltiples proveedores

---

## 📁 Estructura del Proyecto

```
social-login/
├── src/
│   ├── main/
│   │   ├── java/dev/oauth2/social_login/
│   │   │   ├── SocialLoginApplication.java
│   │   │   ├── Config/SecurityConfig.java
│   │   │   └── Controller/HomeController.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/dev/oauth2/social_login/
│           └── SocialLoginApplicationTests.java
├── pom.xml
└── mvnw.cmd
```

---

## ⚙️ ¿Cómo funciona?

- **/** → Endpoint público: muestra un mensaje de bienvenida.
- **/secured** → Endpoint protegido: accesible solo después del login con GitHub o Google.
- Al intentar acceder a rutas protegidas, se inicia automáticamente el flujo de autenticación OAuth2.

---

## 🔧 Configuración OAuth2

### 1. Registra tu aplicación en los siguientes portales:

- 🌐 [GitHub Developer Settings](https://github.com/settings/developers)
- 🌐 [Google Cloud Console](https://console.cloud.google.com/apis/credentials)

### 2. Agrega las credenciales a `src/main/resources/application.properties`:

```properties
# GitHub
spring.security.oauth2.client.registration.github.client-id=TU_CLIENT_ID_GITHUB
spring.security.oauth2.client.registration.github.client-secret=TU_CLIENT_SECRET_GITHUB

# Google
spring.security.oauth2.client.registration.google.client-id=TU_CLIENT_ID_GOOGLE
spring.security.oauth2.client.registration.google.client-secret=TU_CLIENT_SECRET_GOOGLE
```

---

## 🏃‍♂️ Ejecución

En sistemas Unix/macOS:

```bash
./mvnw spring-boot:run
```

En Windows:

```cmd
mvnw.cmd spring-boot:run
```

Luego accede a: [http://localhost:8080](http://localhost:8080)

---

## 🧪 Pruebas

Las pruebas básicas se encuentran en:

```
src/test/java/dev/oauth2/social_login/SocialLoginApplicationTests.java
```

---

## 🛡️ Seguridad

El proyecto utiliza configuraciones de seguridad modernas mediante Spring Security y delega la autenticación en los proveedores externos usando OAuth2.

---

## 📢 Créditos & Licencia

- Licencia: [Apache License 2.0](https://www.apache.org/licenses/LICENSE-2.0)
- Desarrollado con **Spring Boot** y **OAuth2**

---

¡Listo para comenzar a autenticar con estilo! 🚀
