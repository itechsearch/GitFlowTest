pipeline{
    agent any
    stages{
        stage   ('Code Compile stage')
        {
            steps{
                withMaven(maven: 'MAVEN'){
                    sh 'mvn clean compile'
                }
            }
        }
        stage   ('Testing stage')
                {
                    steps{
                        withMaven(maven: 'MAVEN'){
                            sh 'mvn test'
                        }
                    }
                }
        stage   ('Deployment stage')
                        {
                            steps{
                                withMaven(maven: 'MAVEN'){
                                    sh 'mvn deploy'
                                }
                            }
                        }
    }
}