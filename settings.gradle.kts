pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        /*maven {
            name = "GithubPackages"
            url = uri("https://maven.pkg.github.com/hirensorathiya2022/LibraryTesting")
            credentials{
                username = "hirensorthiya2022"
                password = "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"
            }
        }*/

        maven { url = uri("https://jitpack.io") }
    }
}

rootProject.name = "TestingLibrary"
include(":app")
include(":MathLibrary")
