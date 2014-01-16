//
//  ContentManager.m
//  Inscriere
//
//  Created by Viorel Radu on 15/01/14.
//  Copyright (c) 2014 UPB. All rights reserved.
//

#import "ContentManager.h"

@implementation ContentManager
@synthesize contentViewController;
+ (id) contentManager {
    static ContentManager *contentController = nil;
    static dispatch_once_t onceToken;
    dispatch_once(&onceToken, ^{
        contentController = [[self alloc] init];
    });
    return contentController;
}

- (id)init {
    if (self = [super init]) {
        contentViewController = [[ContentViewController alloc]init ];
    }
    return self;
}

@end
