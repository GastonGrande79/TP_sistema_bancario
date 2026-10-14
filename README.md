[Sistema Bancario.md](https://github.com/user-attachments/files/33260000/Sistema.Bancario.md)
# Sistema Bancario - Trabajo Práctico Integrador

Proyecto desarrollado en Java aplicando los principios fundamentales de la **Programación Orientada a Objetos (POO)**. Representa un modelo de dominio para la gestión de clientes y cuentas bancarias, incluyendo operaciones en pesos, giro en descubierto, depósito de cheques y operaciones bimonetarias (cuentas de convertibilidad).

## 📋 Consigna y Requerimientos

El objetivo es modelar un sistema bancario para el **Centro de Formación Profesional N°8**  que permita administrar:

1. **Clientes**:

   * **Cliente Individual**: Posee número de cliente, nombre, apellido y DNI.

   * **Cliente Empresa**: Posee número de cliente, nombre de fantasía y CUIT.

2. **Cuentas**:

   * **Caja de Ahorro**: Permite depósitos, extracciones (sin exceder el saldo) y cobro de intereses acumulados según una tasa configurada.

   * **Cuenta Corriente**: Permite depósitos en efectivo, depósitos de cheques (con validación de vigencia de 30 días) y extracciones con límite de giro en descubierto.

   * **Cuenta Convertibilidad** *(Nuevo producto para empresas)*: Hereda de la cuenta corriente y suma operabilidad bimonetaria (depósito, extracción y conversión entre Pesos y Dólares con tasa configurable).

## 🛠️ Tecnologías y Herramientas Utilizadas

* **Lenguaje**: Java 17+

* **Librerías**: Lombok (`@Getter`, `@ToString`, `@AllArgsConstructor`)

* **API Fecha/Hora**: `java.time.LocalDate`

* **Paradigma**: Programación Orientada a Objetos (Herencia, Polimorfismo, Encapsulamiento, Abstracción).

## 📐 Estructura del Proyecto

El código está modularizado en paquetes según las responsabilidades del sistema:

```
src/
└── poo/clases/poo_tn_sistema_bancario/tp_n_1/
    ├── clientes/
    │   ├── Cliente.java              # Clase abstracta base
    │   ├── ClienteIndividual.java    # Subclase para personas físicas
    │   └── ClienteEmpresa.java       # Subclase para personas jurídicas
    │
    ├── cuentas/
    │   ├── Cuenta.java               # Clase abstracta base de cuentas
    │   ├── CajaAhorro.java           # Implementación con cálculo de interés
    │   ├── CuentaCorriente.java      # Implementación con descubierto y cheques
    │   ├── CuentaConvertibilidad.java # Extensión de CuentaCorriente bimonetaria
    │   └── Cheque.java               # Modelo y lógica de validación de cheques
    │
    └── test/
        ├── TestCajaAhorro.java       # Pruebas unitarias/mains de Caja de Ahorro
        ├── TestCuentaCorriente.java  # Pruebas de giro en descubierto
        ├── TestCuentaConvertibilidad.java # Pruebas de operaciones en USD
        └── TestCheque.java           # Pruebas de validación temporal de cheques

```

## 🚀 Conceptos de POO Aplicados

* **Abstracción**: Clases abstractas `Cliente` y `Cuenta` definen el contrato básico que deben cumplir sus derivadas.

* **Herencia**:

  * `CajaAhorro` y `CuentaCorriente` extienden de `Cuenta`.

  * `CuentaConvertibilidad` extiende de `CuentaCorriente`, reutilizando la gestión en pesos y el giro en descubierto.

* **Encapsulamiento**: Modificadores de acceso `private` y `protected` (`actualizarSaldo`) para preservar el estado interno del objeto sin exposición innecesaria.

* **Polimorfismo**: Sobrescritura (`@Override`) de métodos abstractos `depositarEfectivo` y `extraerEfectivo` adaptados a las reglas de negocio de cada tipo de cuenta.

## 🧪 Ejecución de Pruebas

Para validar el correcto funcionamiento de cada componente, se pueden ejecutar las clases ubicadas en el paquete `test`:

1. **`TestCajaAhorro`**: Verifica restricciones de extracción por saldo insuficiente y la acreditación de intereses.

2. **`TestCuentaCorriente`**: Comprueba el límite de giro en descubierto permitiendo saldos negativos hasta el margen autorizado.

3. **`TestCheque`**: Revisa que los cheques solo se puedan cobrar dentro de la ventana de tiempo válida (desde su fecha de pago hasta 30 días posteriores).

4. **`TestCuentaConvertibilidad`**: Evalúa el intercambio de divisa ($/US$) y las restricciones de extracción en dólares.

## 👨‍💻 Creado para

**CFP N°8** 

Curso de Java Programación Orientada a Objetos
