pipeline {

    agent any

    stages {

        stage("Sonarqube Test") {
            steps {
                withSonarQubeEnv('Sonarqube') {
                    sh "./gradlew sonarqube"
                }
            }
        }

        stage('Build') {
            steps {
                sh "./gradlew build -x test"
            }
        }

    }

}