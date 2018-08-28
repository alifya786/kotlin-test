package patches.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_1.*
import jetbrains.buildServer.configs.kotlin.v2018_1.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2018_1.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the buildType with id = 'KotlinTestingConfig'
accordingly, and delete the patch script.
*/
changeBuildType(RelativeId("KotlinTestingConfig")) {
    expectSteps {
    }
    steps {
        insert(0) {
            script {
                scriptContent = """echo "TeamCity""""
            }
        }
    }
}
