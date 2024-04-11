pipeline {
    agent any

    environment {
        // Define variables here if needed
        DOCKER_IMAGE = 'my-springboot-app'
        DOCKER_FILE = 'Dockerfile'
        SPRING_PROFILE = 'dev'
    }

    stages {
        stage('Build') {
            steps {
                script {
                    // Build the Docker image
                    docker.build("${DOCKER_IMAGE}:${SPRING_PROFILE}", "-f ${DOCKER_FILE} .")
                }
            }
        }

        stage('Run') {
            steps {
                script {
                    // Run the Docker container
                    docker.image("${DOCKER_IMAGE}:${SPRING_PROFILE}").run("-p 8080:8080")
                }
            }
        }
    }
}

