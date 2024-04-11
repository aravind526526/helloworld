pipeline {
    agent any



    stages {
        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }
        stage('Build Docker Image') {
                    steps {
                        script {
                            docker.build('my-app') // Build your Docker image
                        }
                    }
                    }
    }
}
