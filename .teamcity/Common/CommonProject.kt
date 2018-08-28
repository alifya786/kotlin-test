package TeamcityCommon

import jetbrains.buildServer.configs.kotlin.2018_1.Project
import jetbrains.buildServer.configs.kotlin.2018_1.vcs.GitVcsRoot
import jetbrains.buildServer.configs.kotlin.2018_1.*

import jetbrains.buildServer.configs.kotlin.2018_1.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.2018_1.projectFeatures.versionedSettings

fun addProjectProperties(project: Project, project_uuid: String, project_id: String, project_parentId: String, project_name: String, project_vcsRoot: GitVcsRoot, project_buildTypes: List<BuildType>, versionedSettings_id: String): Unit {
    project.uuid = project_uuid
    project.id = project_id
    project.parentId = project_parentId
    project.name = project_name
    project.vcsRoot(project_vcsRoot)
    project_buildTypes.forEach {
        project.buildType(it)
    }
    project.features({
        versionedSettings {
            id = versionedSettings_id
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.PREFER_SETTINGS_FROM_VCS
            rootExtId = project_vcsRoot.id
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    })
}