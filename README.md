# Gestión de stock de un depósito

Trabajo práctico de Gestión de la Configuración de Software de la UTN Facultad Regional Santa Fe. La aplicación utiliza el caso de un depósito de e-commerce. El programa calcula unidades de stock.

## Compilación y pruebas

Con JDK 21 y Bash, este comando se ejecuta desde la raíz del repositorio.

```bash
bash scripts/verificar.sh
```

El script compila todas las clases y ejecuta cada clase de pruebas. Cada conjunto aprobado imprime una línea que empieza por `OK`. Un error de compilación o una prueba fallida detiene la verificación. GitHub Actions ejecuta este mismo comando en los pull requests y en los pushes a `main` y `develop`.

## Operación disponible

`Despacho.stockRestante(12, 5)` calcula las existencias que quedan después de preparar un pedido. El resultado esperado es `7`. Las pruebas de `DespachoTest` ejercitan esta operación.

## Equipo y organización

El equipo está integrado por `@mateopozzo`, `@aspai1`, `@juaniizquierdo` y `@Alag7`. `src/` contiene el programa y `tests/` contiene las pruebas ejecutables. El directorio `out/` se genera al compilar. El archivo `VERSION` identifica la versión y `CHANGELOG.md` describe los cambios de cada publicación.

Usamos Gitflow. `main` representa producción en este ejercicio y `develop` integra los cambios. Cada `feature/*` parte de `develop`. Una `release/*` parte de `develop`, recibe sus propios cambios de preparación y llega a `main`. Un `hotfix/*` parte de `main` para corregir la versión publicada. Después de cada publicación incorporamos el resultado de `main` en `develop`. Las etiquetas `vX.Y.Z` identifican los commits productivos.

## Qué documentamos en el README y por qué

Documentamos el objetivo y el alcance para que se entienda qué operación del depósito se modela. Indicamos herramientas, comandos, entradas y resultados para que un tercero pueda repetir nuestras pruebas. La estructura del código y las reglas de ramas orientan a quien contribuye. Versionar este README permite recuperar las instrucciones que corresponden a cada versión del programa. Los mensajes de commit explican decisiones. `git log --oneline --graph --all` reconstruye la secuencia de ramas y merges. `git show HEAD` muestra el mensaje y los cambios del commit actual. Las etiquetas permiten recuperar cada publicación y su documentación.

## Qué pedimos a quien abre un pull request externo

| Dato que pedimos | Por qué lo pedimos |
| --- | --- |
| Objetivo, comportamiento anterior y motivo del cambio | Permite decidir si la propuesta resuelve el problema planteado. |
| Requisito o issue relacionada | Vincula la implementación con la necesidad que la originó. |
| Solución, archivos afectados e impacto previsto | Ayuda a elegir revisores, evaluar compatibilidad y localizar posibles regresiones. |
| Comando, datos de prueba, salida esperada y observada | Permite reproducir la validación sobre el commit que se va a integrar. |

GitHub muestra esos campos mediante `.github/pull_request_template.md`. Con el diff y los comentarios por línea discutimos cambios concretos. `CODEOWNERS` identifica responsables de revisión, las aprobaciones dejan registro de la decisión y Actions publica el resultado del CI. Las issues vinculadas conservan el motivo del cambio.
