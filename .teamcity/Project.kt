import jetbrains.buildServer.configs.kotlin.v2018_1.*
import jetbrains.buildServer.configs.kotlin.v2018_1.Project

import Common.addProjectProperties

object Project : Project({
    addProjectProperties(this, project_vcsRoot)
})




