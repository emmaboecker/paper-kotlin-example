# KSpigot Gradle Kotlin Template

This is a template for creating a [Paper Plugin](https://papermc.io)
with [KSpigot](https://github.com/jakobkmar/kspigot)
, [Gradle Kotlin DSL](https://docs.gradle.org/current/userguide/kotlin_dsl.html) and
the [Kotlin](https://kotlinlang.org) programming language.

## How to use

1. Click [**Use this template**](../../generate) at the top.
2. Clone the newly created Repository.
3. Open the Project in IntelliJ.
4. Change project name in [**settings.gradle.kts**](/settings.gradle.kts#L1).
5. Edit group-id and version in [**build.gradle.kts**](/build.gradle.kts#L8-L9).
6. Right-click on either `org.example` packages in the `java` or `kotlin` directory and select **Refactor > Rename**.
   When IntelliJ opens a popup called `Rename Package Directories` press **All Directories**. Now change the group- and
   package-id to your desired name.
7. Now do the same to the Loader and Main class of the Project.
8. Edit the [**paper-plugin.yml**](/src/main/resources/paper-plugin.yml) to your liking.

## License

This template is licensed under the [MIT License](https://choosealicense.com/licenses/mit/).