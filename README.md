![logo](https://github.com/user-attachments/assets/fade345f-2d83-4e3a-848f-6e06332c12a0)
This is a simple template for Android apps that follows best practices.

## Getting Started
1. Create a repository that uses this repository as a template
2. Open the project in Android Studio
3. In ```app/res/values/string.xml```, change ```app_name``` to your desired application name
4. In ```settings.gradle.kts```, change ```rootProject.name``` to your desired application name
5. In every app module ```build.gradle.kts```, change ```namespace``` and ```applicationId``` to your desired package name
6. In all the other module level ```build.gradle.kts```, change ```namespace``` to the corresponsing package name. For example, if your package is ```com.alexru.myapp```, change the ```namespace``` for the data-local module to ```com.alexru.data_local```
7. Refactor and rename the project folders.
   ![Screenshot 2024-10-06 181620](https://github.com/user-attachments/assets/063f3971-9aa6-47e6-8be4-2b5f013b7421)
   Select ```All Directories``` in the popup menu and rename the package to your desired package name. Make sure the scope is ```Project Files```. Do this for every module.
8. Sync Gradle scripts in the File menu. You can also press ```Ctrl+Shift+O```.
9. Clean and rebuild the project in the Build menu.

## Useful Features
- UI with Android Compose
- Library management with Kotlin DSL
- Modularization
- Dependency injection with Dagger-Hilt
- Network calls with OkHttp and Retrofit
- Local storage with Room
- Navigation with Navigation Compose
