//
//  AboutViewController.m
//  Inscriere
//
//  Created by Viorel Radu on 15/01/14.
//  Copyright (c) 2014 UPB. All rights reserved.
//

#import "AboutViewController.h"
#import "ContentViewController.h"

@interface AboutViewController ()

@property (retain, nonatomic) IBOutlet UIWebView *webView;

@end

@implementation AboutViewController
@synthesize webView;
- (id)initWithNibName:(NSString *)nibNameOrNil bundle:(NSBundle *)nibBundleOrNil
{
    self = [super initWithNibName:nibNameOrNil bundle:nibBundleOrNil];
    if (self) {
        // Custom initialization
        webView = [[UIWebView alloc]init];
    }
    return self;
}

- (void)viewDidLoad
{
    [super viewDidLoad];
	// Do any additional setup after loading the view.
    self.webView.delegate = self;
    [webView loadRequest:[NSURLRequest requestWithURL:[NSURL fileURLWithPath:[[NSBundle mainBundle] pathForResource:@"About" ofType:@"htm"]isDirectory:NO]]];
}

- (void)didReceiveMemoryWarning
{
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

@end
