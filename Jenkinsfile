node {

   stage('Extrair Codigo Fonte') {
         echo 'Extraindo codigo fonte...'
         checkout([$class: 'GitSCM', branches: [[name: '*/main']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/jeytoyota/numeros-pipeline.git']]])
   }

   stage('Compilar') {
      echo 'Realizando a copilação...'
      sh 'javac Primos.java'
        
   }
   
   stage("Execução") {
        script {
            env.OPTION = input message: 'Deseja executar:', ok: 'Release!',
                                parameters: [choice(name: 'OPTION', choices: 'Yes\nNo', description: 'Deseja executar o arquivo?')]
                    }
                    echo "${env.OPTION}"
                 
            
    }
     stage ("Executar") {
            if("${env.OPTION}" == 'Yes')  {
                echo "O arquivo está sendo executado"
                sh 'java Primos' 
            }
                  
        else{
            echo "Projeto não executado"
        }
     }
     
     stage ("Deploy") {
            if("${env.OPTION}" == 'Yes')  {
                echo "Operação realizada com sucesso" 
            }
                  
        else{
            echo "Projeto não listado"
            
        }
     }
}
