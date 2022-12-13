pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/DrewTodd0628/jenkintest.git'
                bat 'mvnw clean compile'
            }
        }
        
        stage('Test') {
            steps {
                bat 'mvnw test'
            }

            post {
                always {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    cleanWs disableDeferredWipeout: true, deleteDirs: true
                }
            }
        }
    }
}
