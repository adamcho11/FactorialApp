pipeline {
  agent any

  stages {
    stage('Checkout') {
      steps {
        checkout scm
      }
    }

    stage('Verificar entorno') {
      steps {
        sh 'java -version'
        sh 'mvn -v'
      }
    }

    stage('Compilar') {
      steps {
        sh 'mvn -B clean compile'
      }
    }

    stage('Pruebas') {
      steps {
        sh 'mvn -B test'
      }
    }

    stage('Empaquetar') {
      steps {
        sh 'mvn -B package'
      }
    }
  }

  post {
    success {
      echo 'Build y pruebas exitosas'
    }
    failure {
      echo 'Fallo el proceso'
    }
  }
}
