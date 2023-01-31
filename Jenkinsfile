pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                git 'https://github.com/daveotengo/SimpleArithmethic.git'
                sh './mvn clean package'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                sh './mvn test'
            }
            
            post {
	           	always {
	            	junit '**/target/surefire-reports/TEST=*.xml'
	            }
	            success {
	            echo 'Archiving the artifact'
	            archiveArtifacts artifact: '**/target/*.war
	            }
            }
        }
        
        stage('Deploy to Tomcat Server') {
            steps {
                echo 'Deploying....'
            }
        }
        
    }
}