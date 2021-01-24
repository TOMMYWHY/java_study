// @ts-nocheck
import React from 'react';
import { ApplyPluginsType } from '/Users/Tommy/Desktop/studyInMassey/Java_study/react/node_modules/@umijs/runtime';
import * as umiExports from './umiExports';
import { plugin } from './plugin';

export function getRoutes() {
  const routes = [
  {
    "path": "/HelloWorld",
    "exact": true,
    "component": require('@/pages/HelloWorld.js').default
  },
  {
    "path": "/List",
    "exact": true,
    "component": require('@/pages/List.js').default
  },
  {
    "path": "/Show",
    "exact": true,
    "component": require('@/pages/Show.js').default
  }
];

  // allow user to extend routes
  plugin.applyPlugins({
    key: 'patchRoutes',
    type: ApplyPluginsType.event,
    args: { routes },
  });

  return routes;
}
