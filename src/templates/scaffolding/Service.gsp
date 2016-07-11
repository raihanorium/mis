package ${domainClass.packageName.replaceAll(".entity",".service")}

import com.athena.mis.BaseDomainService
import ${domainClass.packageName}.${className.toString()}
import com.athena.mis.utility.DateUtility


class ${className}Service  extends BaseDomainService {

            @Override
            public void init() {
                domainClass = ${className.toString()}.class
            }


            /**
             * Pull ${propertyName} object
             * @return - list of ${propertyName}
             */
            @Override
            public List<${className.toString()}> list() {
              return ${className.toString()}.findAllByCompanyId(companyId, [sort: ${className.toString()}.DEFAULT_SORT_FIELD, order: ASCENDING_SORT_ORDER, readOnly: true]);
           }

    /**
    * Get list of ${className.toString()} by list of ids
    * @param lst${className.toString()}Ids - list of AppGroup.id
    * @return - list of ${className.toString()} by ids
    */
    public List<${className.toString()}> findAllByIdInList(List<Long> lst${className.toString()}Ids) {
        List<${className.toString()}> lst${className.toString()} = ${className.toString()}.findAllByIdInList(lst${className.toString()}Ids, [sort: ${className.toString()}.DEFAULT_SORT_FIELD, order: ASCENDING_SORT_ORDER, readOnly: true])
        return lst${className.toString()}
    }



    @Override
    public void createDefaultSchema() {
       //Write your default schema code here

        }




    @Override
    public boolean createTestData(long companyId, long userId) {
      //Write your default data insert statement here
        return true
    }


}
