pipeline{
    agent any
    stages{
        stage   ('Code Compile stage')
        {
            steps{
                withMaven(maven: 'MAVEN'){
                    bat 'mvn clean compile'
                    echo 'completed'
                }
            }
        }
        stage   ('Testing stage')
                {
                    steps{
                        withMaven(maven: 'MAVEN'){
                            bat 'mvn test'
                        }
                    }
                }
        stage   ('Deployment stage')
                        {
                            steps{
                                withMaven(maven: 'MAVEN'){
                                    bat 'mvn deploy'
                                }
                            }
                        }
    }
}