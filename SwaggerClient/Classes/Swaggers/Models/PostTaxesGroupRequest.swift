//
// PostTaxesGroupRequest.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PostTaxesGroupRequest: Codable {

    public var name: String?
    public var locale: String?
    public var taxComponents: [PostTaxesGroupTaxComponents]?
    public var dateFormat: String?

    public init(name: String?, locale: String?, taxComponents: [PostTaxesGroupTaxComponents]?, dateFormat: String?) {
        self.name = name
        self.locale = locale
        self.taxComponents = taxComponents
        self.dateFormat = dateFormat
    }


}

