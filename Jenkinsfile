pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // git 'https://github.com/DrewTodd0628/jenkintest.git'
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
                }
            }
        }

        stage('Publish') {
            steps {
                bat 'mvnw package'
            }

            post {
                success {
                    archiveArtifacts '**/target/*.jar'
                }

                always {
                    cleanWs disableDeferredWipeout: true, deleteDirs: true
                }
            }
        }
    }
}
