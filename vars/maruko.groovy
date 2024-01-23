def selectEnv(String mitfunSetting) {

    def mitfunEnv = "Dev"

    switch(mitfunSetting) {
        case ["Support_Group", "Dev"]:
            mitfunEnv = "Dev"
            break
        case "Intl_TEST":
            mitfunEnv = "Test"
            break
        case "Intl_UAT":
            mitfunEnv = "Uat"
            break
        case ["Intl_PROD_GM", "Intl_PROD"]:
            mitfunEnv = "Pro"
            break
    }

    return mitfunEnv
}