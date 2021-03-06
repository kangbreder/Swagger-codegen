//
// GetAccountNumberFormatsResponseTemplate.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetAccountNumberFormatsResponseTemplate: Codable {

    public var accountTypeOptions: [EnumOptionData]?
    public var prefixTypeOptions: [String:[EnumOptionData]]?

    public init(accountTypeOptions: [EnumOptionData]?, prefixTypeOptions: [String:[EnumOptionData]]?) {
        self.accountTypeOptions = accountTypeOptions
        self.prefixTypeOptions = prefixTypeOptions
    }


}

