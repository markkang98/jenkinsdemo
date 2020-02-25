pipeline {
    agent any
    tools {
        maven 'maven'
        java 'JDK'
     }
    stages {
        stage('build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('test'){
            steps {
                sh 'mvn test'
            }
        }
    }
}