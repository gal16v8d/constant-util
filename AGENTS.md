# AGENTS.md

Tiny single-module Java library (Java 25, Maven). All code is constants classes in `src/main/java/com/gsdd/constants/`; it is consumed as a dependency by other GSDD projects. No tests exist in this repo.

## Build & verify

- `mvn verify` — the full check; passes end to end (spotless → compile → jacoco → checkstyle → package). There are no tests, so never add `-DskipTests` thinking it's needed.
- Spotless (`google-java-format 1.21.0`) is bound to `apply` during the build, so `mvn verify` reformats files itself. `ratchetFrom=origin/main` limits it to files changed vs `origin/main`. If you edit Java, either run `mvn spotless:apply` or let the build do it — don't hand-format.
- Plugin versions/management come from the parent `com.gsdd:gsdd-parent:1.0.7`; the module `pom.xml` only configures executions.

## Code conventions

- Every constants class follows the same shape: `public final class` with `@NoArgsConstructor(access = AccessLevel.PRIVATE)` from Lombok. Match that pattern when adding classes/constants.
- `.mvn/jvm.config` exports JDK compiler modules so Lombok annotation processing works on modern JDKs. Maven applies it automatically; keep it in sync if you bump the toolchain.
- Checkstyle uses `ch-suppressions.xml` (suppresses Javadoc, `LineLength` conflict with spotless, and `HideUtilityClassConstructor` since Lombok generates the private ctor).
- Do not edit files under `target/` or `.scannerwork/` (build/sonar outputs).

## Not run by default (don't be surprised)

- Dependency-check (OWASP/NVD) is skipped via `dependency-check.skip=true`; running it requires `NVD_API_KEY` env and a network/NVD call.
- Sonar (`sonar-project.properties`) targets a local server at `http://localhost:9000` and needs `SONAR_LOGIN_TOKEN`. And the scan expects `target/dependency/lombok-*.jar`, so run `mvn package` (or `dependency:copy-dependencies`) first.
- JaCoCo excludes the whole `**/constants/**` package and enforces 80% coverage, but with no tests the `check` goal just skips due to missing `jacoco.exec`.