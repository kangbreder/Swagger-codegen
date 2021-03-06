//
// GetAccountRulesTemplateResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetAccountRulesTemplateResponse: Codable {

    public var systemDefined: Bool?
    public var allowedOffices: [OfficeData]?
    public var allowedAccounts: [GLAccountData]?

    public init(systemDefined: Bool?, allowedOffices: [OfficeData]?, allowedAccounts: [GLAccountData]?) {
        self.systemDefined = systemDefined
        self.allowedOffices = allowedOffices
        self.allowedAccounts = allowedAccounts
    }


}

