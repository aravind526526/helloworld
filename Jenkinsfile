pipeline {
 agent any
  stages {
    stage('Maven Install') {
      
      steps {
        sh 'mvn clean install'
      }
    }
    stage('Docker Build') {
      
      steps {
        sh 'docker build -t aravind526526/example:1.0 .'
      }
    }
    stage('Docker Push') {
      
      steps {
        withCredentials([usernamePassword(credentialsId: 'docker-hub-credentials', passwordVariable: 'dockerHubPassword', usernameVariable: 'dockerHubUser')]) {
          sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPassword}"
          sh 'docker push aravind526526/example:1.0'
        }
      }
    }
  }
}
