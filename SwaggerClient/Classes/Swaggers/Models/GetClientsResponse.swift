//
// GetClientsResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetClientsResponse: Codable {

    public var totalFilteredRecords: Int?
    public var pageItems: [GetClientsPageItemsResponse]?

    public init(totalFilteredRecords: Int?, pageItems: [GetClientsPageItemsResponse]?) {
        self.totalFilteredRecords = totalFilteredRecords
        self.pageItems = pageItems
    }


}

