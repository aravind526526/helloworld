pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                bat 'mvn clean install' // Use 'bat' instead of 'sh' for Windows
            }
        }
        // stage('Docker Build & Push') {
        //     steps {
        //         script {
        //             // Use 'bat' for Windows commands
        //             bat 'docker build -t your-image-name .'
        //             bat 'docker push your-image-name'
        //         }
        //     }
        // }
        // stage('Deploy to Kubernetes') {
        //     steps {
        //         script {
        //             // Use 'bat' for Windows commands
        //             bat 'kubectl apply -f your-kubernetes-manifests.yaml'
        //         }
        //     }
        // }
    }
}

