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

                    cleanWs(cleanWhenNotBuilt: false,
                        deleteDirs: true,
                        disableDeferredWipeout: true,
                        notFailBuild: true,
                        patterns: [[pattern: '.gitignore', type: 'INCLUDE'],
                                [pattern: '.propsfile', type: 'EXCLUDE']])
                }
            }
        }
    }
}
