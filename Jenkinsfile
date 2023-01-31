pipeline {
    agent any
	tools {
		maven 'local_maven'
	}
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            
                sh 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                sh 'mvn test'
            }
            
            post {
	           
	            success {
	            echo 'Archiving the artifact'
	            archiveArtifacts artifacts: '**/target/*.war'
	            }
            }
        }
        
        stage('Deploy to Tomcat Server') {
            steps {
                echo 'Deploying....'
                deploy adapters: [tomcat9(credentialsId: '38f23cd1-e034-4c4f-a538-d60465c98aeb', path: '', url: 'http://localhost:8383/')], contextPath: null, war: '**/*.war'
            }
        }
        
    }
}