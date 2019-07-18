//
// GetProductsTypeResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetProductsTypeResponse: Codable {

    public var totalFilteredRecords: Int?
    public var pageItems: [GetProductsPageItems]?

    public init(totalFilteredRecords: Int?, pageItems: [GetProductsPageItems]?) {
        self.totalFilteredRecords = totalFilteredRecords
        self.pageItems = pageItems
    }


}

