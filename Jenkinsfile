pipeline {
    agent
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