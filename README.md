# Automating Android APK & AAB Generation with GitHub Actions

## Overview
This repository contains a fully automated CI/CD workflow using **GitHub Actions** to generate APK and AAB files for your Android project. Every push to the `master` branch triggers a build process, ensuring that your app artifacts are always up-to-date and ready for testing or release.

## Features
✅ Automated build process for APK & AAB generation  
✅ Runs unit tests before building the app  
✅ Uploads generated APK & AAB as artifacts  
✅ Supports manual workflow dispatch for on-demand builds  
✅ Uses GitHub Actions for seamless automation  

## 🛠 Prerequisites
Ensure you have the following installed:
- Android Studio (latest version)
- Java Development Kit (JDK 17)
- Android SDK
- Git


## Read More on Medium
For a detailed step-by-step guide, check out this article on Medium:
[Automating Android APK & AAB Generation with GitHub Actions](https://medium.com/@myofficework000/automating-android-apk-aab-generation-with-github-actions-0910888de1b1)


## 🔧 Setup & Configuration
### 1️⃣ Clone the Repository
```sh
git clone [https://github.com/yourusername/your-repository.git](https://github.com/myofficework000/CICDAndroid)
```

### 2️⃣ Configure GitHub Secrets (Optional for Signed Builds)
If you want to sign your APK/AAB, add the following secrets in **GitHub → Settings → Secrets**:
- `KEYSTORE_FILE` (Base64-encoded keystore file)
- `KEYSTORE_PASSWORD` (Keystore password)
- `KEY_ALIAS` (Key alias)
- `KEY_PASSWORD` (Key password)

### 3️⃣ GitHub Actions Workflow File
This repository includes a **GitHub Actions** workflow located in `.github/workflows/android-build.yml`. It automates the build process and uploads APK & AAB files as artifacts.

## ⚙️ How It Works
1. **On Every Push to Master:** The workflow triggers an automated build.
2. **Unit Tests Execution:** Ensures code quality before building the app.
3. **Build APK & AAB:** Generates both Debug & Release variants.
4. **Upload Artifacts:** The APK and AAB files are available in GitHub Actions for download.

## 🚀 Running the Workflow Manually
You can trigger the workflow manually from the **GitHub Actions** tab:
1. Go to your repository.
2. Click on the **Actions** tab.
3. Select the latest workflow run.
4. Download the generated APK & AAB files from the artifacts section.

## 📂 Output Files
After a successful build, you'll find the APK & AAB files in:
```
app/build/outputs/apk/debug/  (Debug APK)
app/build/outputs/apk/release/ (Release APK)
app/build/outputs/bundle/release/ (AAB File)
```

## 📢 Contribution
Feel free to contribute by opening **issues** or **pull requests**! 🚀

## 📜 License
This project is licensed under the [MIT License](LICENSE).

---
💡 **Need Help?** Reach out via issues or discussions in this repository! Happy coding! 🎉


