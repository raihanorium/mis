package ${packageName.replaceAll(".entity",".controller")}

import ${packageName.replaceAll('.entity','.actions')}.${className.toLowerCase()}.Create${className}ActionService
import ${packageName.replaceAll('.entity','.actions')}.${className.toLowerCase()}.Delete${className}ActionService
import ${packageName.replaceAll('.entity','.actions')}.${className.toLowerCase()}.List${className}ActionService
import ${packageName.replaceAll('.entity','.actions')}.${className.toLowerCase()}.Update${className}ActionService
import com.athena.mis.application.controller.BaseController

class ${className}Controller extends BaseController {

    Create${className}ActionService create${className}ActionService
    Update${className}ActionService update${className}ActionService
    List${className}ActionService list${className}ActionService
    Delete${className}ActionService delete${className}ActionService

    static allowedMethods = [
            show: "POST", create: "POST", update: "POST", delete: "POST", list: "POST"
    ]

    /**
     * Show ${className} UI
     */
    def show() {
        render(view: "/${className.toLowerCase()}/show")
    }

    /**
     * Create new ${className}
     */
    def create() {
        renderOutput(create${className}ActionService, params)
    }

    /**
     * Update ${className}
     */
    def update() {
        renderOutput(update${className}ActionService, params)
    }

    /**
     * Delete ${className}
     *
     */
    def delete() {
        renderOutput(delete${className}ActionService, params)
    }

    /**
     * List & Search ${className}
     */
    def list() {
        renderOutput(list${className}ActionService, params)
    }
}

