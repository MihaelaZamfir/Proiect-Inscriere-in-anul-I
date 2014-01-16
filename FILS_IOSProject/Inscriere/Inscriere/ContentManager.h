//
//  ContentManager.h
//  Inscriere
//
//  Created by Viorel Radu on 15/01/14.
//  Copyright (c) 2014 UPB. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "ContentViewController.h"

@interface ContentManager : NSObject

@property(retain,nonatomic) ContentViewController* contentViewController;
+(id) contentManager;

@end
