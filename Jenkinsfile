pipeline {
 agent any
  stages {
    stage('Maven Install') {
      
      steps {
        bat 'mvn clean install'
      }
    }
    stage('Docker Build') {
      
      steps {
        bat 'docker build -t aravind526526/example:1.0 .'
      }
    }
    stage('Docker Push') {
      
      steps {
        withCredentials([usernamePassword(credentialsId: 'docker-hub-credentials', passwordVariable: 'dockerHubPassword', usernameVariable: 'dockerHubUser')]) {
          bat "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPassword}"
          bat 'docker push aravind526526/example:1.0'
        }
      }
    }
  }
}
