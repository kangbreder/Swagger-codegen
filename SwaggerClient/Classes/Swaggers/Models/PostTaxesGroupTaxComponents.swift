//
// PostTaxesGroupTaxComponents.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PostTaxesGroupTaxComponents: Codable {

    public var taxComponentId: Int?
    public var startDate: String?

    public init(taxComponentId: Int?, startDate: String?) {
        self.taxComponentId = taxComponentId
        self.startDate = startDate
    }


}
